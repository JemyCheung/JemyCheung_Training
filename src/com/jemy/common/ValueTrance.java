package com.jemy.common;


import org.junit.jupiter.api.Test;

public class ValueTrance {
    @Test
    public void testObject() {
        int i = 1;
        changeInt(i);
        System.out.println(i);
        changeInt(i);
        String s = "2";
        changeS(s);
        System.out.println(s);

        Position position = new Position(1, 2);
        changeObj(position);
        System.out.println(position.getX()+"---"+position.getY());
    }

    private void changeInt(int i) {
        i +=1;
    }

    class Position {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    private void changeObj(Position p){
        p.setX(5);
        p.setY(6);
    }

    private void changeS(String s) {
        s = "1";
    }
}
