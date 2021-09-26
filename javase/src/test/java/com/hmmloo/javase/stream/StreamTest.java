package com.hmmloo.javase.stream;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {

    /**
     * 遍历/匹配（foreach/find/match）
     */
    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);
        list.stream().filter(x -> x > 6).forEach(System.out::println);

        Optional<Integer> findFirst = list.stream().filter(x -> x > 6).findFirst();

        Optional<Integer> findAny = list.parallelStream().filter(x -> x > 6).findAny();

        boolean anyMatch = list.stream().anyMatch(x -> x < 6);
        System.out.println("匹配第一个值：" + findFirst.get());
        System.out.println("匹配任意一个值：" + findAny.get());
        System.out.println("是否存在大于6的值：" + anyMatch);
    }

    @Test
    public void test2() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tom", 8900, 23, "male", "New York"));
        persons.add(new Person("Jack", 7000, 25, "male", "Washington"));
        persons.add(new Person("Lily", 7800, 21, "female", "Washington"));
        persons.add(new Person("Anni", 8200, 24, "female", "New York"));
        persons.add(new Person("Owen", 9500, 25, "male", "New York"));
        persons.add(new Person("Alisa", 7900, 26, "female", "New York"));

        List<String> filterList = persons.stream().filter(x -> x.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
        System.out.print("高于8000的员工姓名：" + filterList);
    }

    /**
     * 聚合（max/min/count)
     */
    @Test
    public void test3() {
        List<String> list1 = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
        Optional<String> max1 = list1.stream().max(Comparator.comparing(String::length));
        System.out.println("最长的字符串：" + max1.get());

        List<Integer> list2 = Arrays.asList(7, 6, 9, 4, 11, 6);
        Optional<Integer> max2 = list2.stream().max(Integer::compareTo);
        System.out.println("自然排序的最大值：" + max2.get());


        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
        Optional<Person> max3 = personList.stream().max(Comparator.comparingInt(Person::getSalary));
        System.out.println("员工工资最大值：" + max3.get().getSalary());


        List<Integer> list3 = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
        long count = list3.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
    }

    @Test
    public void test4() {
        String[] strArr = {"abcd", "bcdd", "defde", "fTr"};
        List<String> strList = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("每个元素大写：" + strList);

        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> intListNew = intList.stream().map(x -> x + 3).collect(Collectors.toList());
        System.out.println("每个元素+3：" + intListNew);
    }

    @Test
    public void test5() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
        Optional<Integer> sum1 = personList.stream().map(Person::getSalary).reduce(Integer::sum);
        System.out.println("工资之和：" + sum1.get());
    }
}