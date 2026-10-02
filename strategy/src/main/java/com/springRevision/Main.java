package com.springRevision;

import com.springRevision.context.Context;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Strategy strategy;
        Map<String, Strategy> map  = new HashMap<>();
        while (true) {
            System.out.println("entrer : ");
            String str = scanner.nextLine();
            if (!map.containsKey(str)) {
                strategy = (Strategy) Class.forName("com.springRevision."+str).getConstructor().newInstance();
                map.put(str, strategy);
            }else {
                strategy = map.get(str);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}
