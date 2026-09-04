private static void configureLogging() {
    // 1. Логгер ClassA принимает сообщения всех уровней
    Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
    loggerA.setLevel(java.util.logging.Level.ALL);

    // 2. Логгер ClassB принимает только WARNING и выше
    Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
    loggerB.setLevel(java.util.logging.Level.WARNING);

    // 3. Настройка логгера org.stepic.java для вывода в консоль в формате XML
    Logger loggerJava = Logger.getLogger("org.stepic.java");
    loggerJava.setLevel(java.util.logging.Level.ALL);
    loggerJava.setUseParentHandlers(false);

    java.util.logging.ConsoleHandler consoleHandler = new java.util.logging.ConsoleHandler();
    consoleHandler.setLevel(java.util.logging.Level.ALL);
    consoleHandler.setFormatter(new java.util.logging.XMLFormatter());
    
    loggerJava.addHandler(consoleHandler);
}
