package interfaces;

import interfaces.interfaceprocessor.Apply;
import interfaces.interfaceprocessor.Processor;

import java.lang.reflect.InvocationTargetException;

class CharacterPairSwapper {
    static String swap(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length()-1; i += 2) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            sb.setCharAt(i, c2);
            sb.setCharAt(i + 1, c1);
        }
        return sb.toString();
    }
}

class SwapperAdapter implements Processor {
    @Override
    public String name() {
        return CharacterPairSwapper.class.getSimpleName();
    }

    @Override
    public String process(Object input) {
        return CharacterPairSwapper.swap((String) input);
    }
}

public class E11 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        E11.class.getConstructor().newInstance();

        String s = new String();
        Apply.process(new SwapperAdapter(),"1234");
        Apply.process(new SwapperAdapter(),"abcde");
    }
}