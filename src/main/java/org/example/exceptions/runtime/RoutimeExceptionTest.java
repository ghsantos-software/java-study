package org.example.exceptions.runtime;

public class RoutimeExceptionTest {
    public static void main(String[] args) {
        // checked e unchecked
        Object object = null;
        int[] nums = {1,2};

        System.out.println(object.toString());
        System.out.println(nums[3]);
    }
}
