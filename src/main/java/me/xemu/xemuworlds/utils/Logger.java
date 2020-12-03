package me.xemu.xemuworlds.utils;

public class Logger
{

    private static String prefix = "[XemuWorlds] ";

    public static void log(String string)
    {
        System.out.println(prefix + string);
    };

    public static void warning(String string)
    {
        System.out.println(prefix + "(Warning) " + string);
    };

    public static void critical(String string)
    {
        System.out.println(prefix + "(CRITICAL) " + string);
    };
    
};