package hw20_1;

public class StringTest {

	public static void main(java.lang.String[] args) {
		 System.out.println("hw20_1 ������");
		 char[] arr = new char[26];
	        String s1 = new String();		
	        StringBuffer sb1 = new StringBuffer();
	        
	        //(1) ���� �۾����� ���ڿ��� �����ϱ� ���� String�� �̿��ϰ�, �ݺ��� ���࿡ �ɸ� �ð��� ��  �� ���
	        long t1 = System.nanoTime();		//t1 = String ���� �ð�
	        for(int i=0;i<arr.length;i++)
	        {
	        	for(int j=0; j<i+1; j++) {
	            // ASCII Code�� char�� ����ȯ�Ͽ� �迭�� ���
	            arr[i] = (char)(97+i);
	            s1 += arr[i];
	            }
	        }
	        long t2 = System.nanoTime();	////t2 = String ���� �ð�
	        long time = t2 -t1;	//time = String �ѽð�
	        System.out.println("nanoTime ���� String�� �� �ð�: "+time);
	        System.out.println(s1);
	        
	        //���� �۾����� ���ڿ��� �����ϱ� ���� StringBuffer�� �̿��ϰ�, �ݺ��� ���࿡ �ɸ� �ð��� �� �� ���
	        long t3 = System.nanoTime();		////t3 = StringBuffer ���� �ð�
	        for(int i=0;i<arr.length;i++)
	        {
	        	for(int j=0; j<i+1; j++) {
	            // ASCII Code�� char�� ����ȯ�Ͽ� �迭�� ���
	            arr[i] = (char)(97+i);
	            
	            sb1.append(arr[i]);
	            }
	            
	        }
	        long t4 = System.nanoTime();		//t4 = StringBuffer ���� �ð�
	        long time2 = t4 -t3;				//time2 = StringBuffer �� �ð�
	        System.out.println("nanoTime ���� StringBuffer�� �� �ð�: "+time2);
	        System.out.println(sb1);
	}

}


//***************************

//���ϸ�: StringTest.java

//�ۼ���: ������

//�ۼ���: 2021.11.25

//����: java.lang ��Ű���� StringBuffer, System Ŭ������ ������.

//***************************

