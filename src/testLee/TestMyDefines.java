package testLee;
/**
 * Test self defined ArrayList and LinkedList compared with JDK 
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestMyDefines {
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		MyLinkedList myLinkedList = new MyLinkedList();
		List jdkArrayList = new ArrayList();
		List jdkLinkedList = new LinkedList();
		// add 30000 elements into myArrayList		
		Long myArrayBeginTime = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			myArrayList.add("new:" + i);
		}
		Long myArrayEndTime = System.currentTimeMillis();
		System.out.println("myArrayList add time --->" + (myArrayEndTime - myArrayBeginTime));
	
		// add 30000 elements into myLinkedList
		Long myLinkedBeginTime = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			myLinkedList.add("new:" + i);
		}
		Long myLinkedEndTime = System.currentTimeMillis();
		System.out.println("myLinkedList add time --->" + (myLinkedEndTime - myLinkedBeginTime));
		// add 30000 elements into jdkArrayList
		Long jdkArrayBeginTime = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			jdkArrayList.add("new:" + i);
		}
		Long jdkArrayEndTime = System.currentTimeMillis();
		System.out.println("jdkArrayList add time --->" + (jdkArrayEndTime - jdkArrayBeginTime));
		// add 30000 elements into jdkLinkedList
		Long jdkLinkedBeginTime = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			jdkLinkedList.add("new:" + i);
		}
		Long jdkLinkedEndTime = System.currentTimeMillis();
		System.out.println("myLinkedList add time --->" + (jdkLinkedEndTime - jdkLinkedBeginTime));
		
	}


}
