package com.tonson;

import java.util.List;

import org.mockito.Mockito;

public class MockitoDocumentation extends Mockito{

	/**
	 * Mockito.verify();
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
	
	public static void main(String[] args) {
		verifySomeBehaviour();
	}
	
}
