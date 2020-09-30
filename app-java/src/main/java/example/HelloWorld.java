package example;

public class HelloWorld {

    public static final String PASSWORD = "SuperSecretPassword";

    public void coveredByUnitTest() {
        System.out.println("coveredByUnitTest");
    }

    public void coveredByIntegrationTest() {
        System.out.println("coveredByIntegrationTest");
    }

    public void shouldDefineConstant() {
        doSomething("log the same");
        doTheSame("log the same");
        doSomethingDifferent("log the same");
    }

    public void notCovered() {
        System.out.println("notCovered");
    }

    private void doSomething(String logMessage) {
        String bla = "BLA";
        String bleh = "BLEH";
        String bliep = "BLIEP";

        for (int i = 0; i < 5; i++) {
            //implement
        }
        for (int i = 5; i < 10; i++) {
            //implement
        }
        for (int i = 10; i < 15; i++) {
            //implement
        }
        this.coveredByUnitTest();
        System.out.println(logMessage);

    }

    private void doTheSame(String logMessage) {
        String bla = "BLA";
        String bleh = "BLEH";
        String bliep = "BLIEP";

        for (int i = 0; i < 5; i++) {
            //implement
        }
        for (int i = 5; i < 10; i++) {
            //implement
        }
        for (int i = 10; i < 15; i++) {
            //implement
        }
        this.coveredByUnitTest();
        System.out.println(logMessage);
    }

    private void doSomethingDifferent(String logMessage) {

    }

    private void tooManyParameters(String one, String two, String three, String four, String five, String six, String seven, String eight) {
        this.NameConvention();
    }

    private void NameConvention() {
        doSomething("hello world");
        this.cognitiveComplexityTooHIgh();
    }

    private String cognitiveComplexityTooHIgh() {
        String longString = "abcdefghijklmn";
        if (longString != null && longString.length() > 1 && longString.length() > 2 && longString.length() > 3 || longString.length() == 3) {
            if (longString != null) {
                for (int a = 0; a < 5; a++) {
                    //do something
                    for (int b = 5; b < 10; b++) {
                        // do something
                        for (int c = 10; c < 15; c++) {
                            //do something
                            for (int d = 15; d < 20; d++) {
                                //do something
                            }
                        }
                    }
                }

            }
            return longString;
        } else if (longString != null && longString.length() > 3) {
            return longString;

        } else {
            return "abc";
        }

    }

    //minimal code coverage
    public String getWords(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "lots";
        }

    }

    public void commentedOutCode() {
//        LinkedList<String> argList = new LinkedList<String>(Arrays.asList(args));
//        if (argList.isEmpty()) {
//            System.err.println("Usage " + Apollo.class.getName() + " <bootdir>(;<bootdir>)* <main-class> <arg>*");
//            System.err.println();
//            System.err.println("Mising <bootdir>");
//            System.exit(2);
//        }
//        String[] bootdirs = resolveBootDirs(argList);
//        if (argList.isEmpty()) {
//            System.err.println("Usage " + Apollo.class.getName() + " <bootdir>(;<bootdir>)* <main-class> <arg>*");
//            System.err.println();
//            System.err.println("Mising <main-class>");
//            System.exit(2);
//        }
//        String mainClass = argList.removeFirst();
//        String[] mainArgs = argList.toArray(new String[argList.size()]);
//        ArrayList<URL> urls = new ArrayList<URL>();
//        for (String dir : bootdirs) {
//            dir = dir.trim();
//            if (dir.isEmpty()) {
//                continue;
//            }
//            File bootdir = new File(dir);
//            if (bootdir.isDirectory()) {
//                // Find the jar files in the directory..
//                ArrayList<File> files = new ArrayList<File>();
//                for (File f : bootdir.listFiles()) {
//                    if (f.getName().endsWith(".jar") || f.getName().endsWith(".zip")) {
//                        files.add(f);
//                    }
//                }
//                // Sort the list by file name..
//                Collections.sort(files, new Comparator<File>() {
//                    public int compare(File file, File file1) {
//                        return file.getName().compareTo(file1.getName());
//                    }
//                });
//                for (File f : files) {
//                    add(urls, f);
//                }
//            } else if (bootdir.isFile()) {
//                add(urls, bootdir);
//            }
//        }
//        String tempdir = System.getProperty("apollo.tempdir");
//        if (tempdir == null) {
//            String base = System.getProperty("apollo.base");
//            if (base != null) {
//                tempdir = new File(base, "tmp").getCanonicalPath();
//            }
//        }
//        if (tempdir != null) {
//            System.setProperty("java.io.tmpdir", tempdir);
//        }
//        // Now setup our classloader..
//        URLClassLoader loader = new URLClassLoader(urls.toArray(new URL[urls.size()]));
//        Class<?> clazz = loader.loadClass(mainClass);
//        Method method = clazz.getMethod("main", args.getClass());
//        try {
//            method.invoke(null, (Object) mainArgs);
//        } catch (InvocationTargetException e) {
//            throw e.getTargetException();
//        }
    }
}
