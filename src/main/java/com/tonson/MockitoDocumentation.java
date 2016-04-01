package com.tonson;

import java.util.LinkedList;
import java.util.List;

import org.mockito.Mockito;

public class MockitoDocumentation extends Mockito{

	/**
	 * 1.Mockito.verify();
	 * 检验我们有没有调用过mock的这个方法,如果调用过，则没有输出，如果没有，则会报异常
	 * 一旦创建成功，mock会记录所有的操作，此时我们就可以有选择性地检验所做的操作
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void verifySomeBehaviour(){
		List mockedList = mock(List.class);
		mockedList.add("one");
		mockedList.clear();
		verify(mockedList).add("one");
		verify(mockedList).add("two");
	}
	
	/**
	 * 2.stubbing
	 * 设置操作的桩，声明当对mock执行什么操作时，返回什么内容
	 * mock会给所有的方法添加默认的实现，返回null等默认值
	 * mock的stub可以重写，但后面的会覆盖前面的实现
	 * 一旦stub，后面方法使用时，会一直使用stub的值，不论调用多少次
	 */
	@SuppressWarnings("rawtypes")
	public static void stubbing(){
		LinkedList mockedList = mock(LinkedList.class);

		//设置桩操作，以下两行代码的含义是：当调用获取list的第一个元素时，返回字符串"first",当调用获取list的第二个元素时，抛出异常
		when(mockedList.get(0)).thenReturn("first"); 
		when(mockedList.get(1)).thenThrow(new RuntimeException()); 
		
		System.out.println(mockedList.get(0));
	}
	
}
