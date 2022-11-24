package second;

import first.First;

public class Second {
   protected class Inner implements First {
       public Inner(){};
        @Override
        public void show() {
            System.out.println("Inner");
        }
    }
}
