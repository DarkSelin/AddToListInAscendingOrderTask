package com.company;

import java.util.LinkedList;

public class AscendingSortedList extends LinkedList<Integer> {

    @Override
    public boolean add(Integer value) {
        if (value == null) {
            return false;
        }
        int top = 0;
        int bottom = super.size();
        int mid = top + (bottom - top) / 2;
        if (bottom == 0) {
            super.add(value);
            return true;
        } else if (super.get(top) >= value) {
            super.add(top, value);
            return true;
        } else if (super.get(bottom - 1) <= value) {
            super.add(bottom, value);
            return true;
        }
        while (top < bottom) {
            if (value <= super.get(mid))
                bottom = mid;
            else
                top = mid + 1;
            mid = top + (bottom - top) / 2;
        }
        super.add(bottom, value);
        return true;
    }

}
