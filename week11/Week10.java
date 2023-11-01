import java.util.ArrayList;
import java.util.List;

public class Week10 {

    private String packages = "";
    private ArrayList<String> libraries = new ArrayList<String>();
    private ArrayList<String> classes = new ArrayList<String>();
    private ArrayList<String> staticType = new ArrayList<String>();

    /**
     * nam.
     * 
     * @param line nam.
     */
    private void handlePackage(String line) {
        String[] list = line.trim().split(" ");
        packages = list[list.length - 1].replace(";", "");
    }

    /**
     * nam.
     * 
     * @param line nam.
     */
    private void handleLibraries(String line) {
        String[] list = line.trim().split(" ");
        libraries.add(list[list.length - 1].replace(";", ""));
    }

    /**
     * nam.
     * 
     * @param line nam.
     */
    private void handleClasses(String line) {
        int index1 = line.indexOf("class ") + 6;
        int index2 = line.indexOf(" ", index1);
        if (index2 == -1) {
            return;
        }
        String names = line.substring(index1, index2).trim();
        String[] name = names.split("<");
        classes.add(packages + "." + name[0]);
    }

    /**
     * nam.
     * 
     * @param str nam.
     * @return nam.
     */
    private String handleParameters(String str) {
        if (str.contains("...")) {
            return fixedLibraries(str.replace("...", ""));
        }
        if (str.contains("[]")) {
            int index = str.indexOf("[]");
            return fixedLibraries(str.replace("[]", "")) + str.substring(index);
        }
        if (!str.contains("<")) {
            return fixedLibraries(str);
        }
        int index = str.indexOf("<");
        String fix = fixedLibraries(str.substring(0, index)) + "<";
        String[] list = str.substring(index + 1, str.length() - 1).split(", ");
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                fix = fix.concat(",");
            }
            if (list[i].startsWith("?")) {
                fix = fix.concat(list[i]);
            } else {
                fix = fix + fixedLibraries(list[i]);
            }
        }
        return fix.concat(">");
    }

    /**
     * nam.
     * 
     * @param line nam.
     */
    private void handleStaticType(String line) {
        if (line.contains("=")) {
            return;
        }
        int index1 = line.indexOf("(");
        int index2 = line.indexOf(")", index1 + 1);
        if (index2 == -1 || index1 == -1) {
            return;
        }
        String methodName = line.substring(line.substring(0, index1).lastIndexOf(" ") + 1, index1);
        if (index2 - index1 == 1) {
            staticType.add(methodName.concat("()"));
            return;
        }
        String fixMethod = methodName + "(";
        String params = line.substring(index1 + 1, index2);
        String[] list = params.split(", ");
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                fixMethod = fixMethod.concat(",");
            }
            String str = list[i].substring(0, list[i].lastIndexOf(" "))
                    .replace("final ", "").trim();
            String param = handleParameters(str);
            fixMethod = fixMethod.concat(param);
        }
        fixMethod = fixMethod.concat(")");
        staticType.add(fixMethod);
    }

    /**
     * nam.
     * 
     * @param str nam.
     * @return nam.
     */
    private String fixedLibraries(String str) {
        for (String s : libraries) {
            if (s.endsWith("." + str)) {
                return s;
            }
        }

        for (String s : classes) {
            if (s.endsWith(str)) {
                return s;
            }
        }

        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' && str.length() > 1) {
            return "java.lang." + str;
        }
        return str;
    }

    /**
     * nam.
     * 
     * @param fileContent nam.
     * @return nam.
     */
    private String setFileContentToOneLine(String fileContent) {
        StringBuilder strb = new StringBuilder(fileContent);
        int index1 = strb.indexOf("(");
        while (index1 != -1) {
            int index2 = strb.indexOf(")", index1);
            for (int i = index2; i > index1; i--) {
                if (strb.charAt(i) == '\n') {
                    strb.deleteCharAt(i);
                }
            }
            index1 = strb.indexOf("(", index1 + 2);
        }
        return strb.toString();
    }

    /**
     * nam.
     * 
     * @param fileContent nam.
     * @return nam.
     */
    private String removeComents(String fileContent) {
        StringBuilder strb = new StringBuilder(fileContent);
        int index1 = strb.indexOf("//");
        while (index1 != -1) {
            int index2 = strb.indexOf("\n", index1);
            if (index2 == -1) {
                strb.delete(index1, strb.length());
                break;
            }
            strb.delete(index1, index2);
            index1 = strb.indexOf("//");
        }

        index1 = strb.indexOf("/*");
        while (index1 != -1) {
            int index2 = strb.indexOf("*/", index1);
            if (index2 == -1) {
                break;
            }
            strb.delete(index1, index2 + 3);
            index1 = strb.indexOf("/*");
        }
        return strb.toString();
    }

    /**
     * nam.
     * 
     * @param fileContent nam.
     * @return nam.
     */
    public List<String> getAllFunctions(String fileContent) {
        String temp = removeComents(setFileContentToOneLine(fileContent));
        String str = temp.replace("{", "{\n");
        String[] lines = str.split("\n");
        List<String> staticCode = new ArrayList<>();
        for (String line : lines) {
            if (line.startsWith("import")) {
                handleLibraries(line);
            } else if (line.startsWith("package")) {
                handlePackage(line);
            } else if (line.contains("class")) {
                handleClasses(line);
            } else if (line.contains("static")) {
                staticCode.add(line);
            } else if (line.contains("enum")) {
                handleClasses(line.replace("enum", "class"));
            } else if (line.contains("interface")) {
                handleClasses(line.replace("interface", "class"));
            }
        }
        for (String method : staticCode) {
            handleStaticType(method);
        }
        return staticType;
    }
} 