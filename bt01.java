package baitap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int userNumber = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        //tim so lon nhat trong mang
        Optional<Integer> num = numbers.stream().max(Integer::compare);
        System.out.println(num);
        //tim so chan
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
        //loc so lon hon 1 so xac dinh ma nguoi dung nhap vao
        numbers.stream().filter(number -> number > userNumber).forEach(System.out::println);
        //tong cac so co trong danh sach
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        //kiem tra danh sach co chua it nhat 1 so chan hay k
        boolean check = numbers.stream().anyMatch(number -> number %2 ==0);
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // tao danh sach cac so tu x den y
        int x = 1;
        int y = 10;
        IntStream.range(x,y).forEach(System.out::println);
        //sap xep danh sach theo thu tu bang chu cai
        List<String> str = new ArrayList<>();
        str.add("quang tran");
        str.add("vien");
        str.add("duc anh");
        str.add("tac");
        str.stream().sorted(String::compareTo).forEach(System.out::println);
        //chuyen cac chuoi thanh chu in hoa
        List<String> upperCaseSetting = str.stream().map(String::toUpperCase).toList();
        upperCaseSetting.forEach(System.out::println);
    }
}
