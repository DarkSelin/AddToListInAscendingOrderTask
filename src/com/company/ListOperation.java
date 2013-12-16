package com.company;

import java.util.List;

public class ListOperation {

    /**
     *
     * @param list - List<Integer> - list for adding a value.
     * @param value - Integer variable for adding to list.
     *              Throws NumberFormatException if value is null.
     */
    public static void addToList(List<Integer> list, Integer value){
        validateArgument(value);
        int top=0;
        int bottom=list.size();
        int mid=top+(bottom-top)/2;
        if (bottom==0){
            list.add(value);
        } else if(list.get(top)>=value){
            list.add(top, value);
            return;
        } else if(list.get(bottom-1)<=value){
            list.add(bottom,value);
            return;
        }
        while(top<bottom){
            if(value<=list.get(mid))
                bottom=mid;
            else
                top=mid+1;
            mid=top+(bottom-top)/2;
        }
        list.add(bottom,value);
    }

    private static void validateArgument(Integer argument){
        if(argument==null)
            throw new IllegalArgumentException("Value for adding to list shouldn't be null.");
    }
}
