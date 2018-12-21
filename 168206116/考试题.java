package test;

public class test {

	public static void main(String[] args) {
		String str=crim();
		System.out.println(str);//不太会python就用java了
	}
	public static String crim(){
		String str="";
		int trueThing=0;//定义真实的事情
		String[] strArray={"A","B","C","D"};//犯罪人数组
		/*
		 * 查看5个事件
		 * A。不是我作案(事件1)!A
		 * A：我没有偷钻石(事件2)!A
		 * B:D就是罪犯(事件3)D
		 * C:B是罪犯（事件4）B
		 * D：B诬陷我（事件5）!D
		 * 该事件采用遍历方式，分别取A，B,C,D为罪犯
		 * 整个事件只有一个人说的是真话
		 */
		for(int i=0;i<strArray.length;i++){
			trueThing= one(strArray[i])+two(strArray[i])+three(strArray[i])+four(strArray[i])+five(strArray[i]);
			if(trueThing==1){
				str+=strArray[i];
			}
		}
		return str;
	}
	public static int one(String str){//是真的就是1，假的就是0
		int i=0;
		if(str.equals("A")){
			i=0;
		}else{
			i=1;
		}
		return i;
	}
	public static int two(String str){//同上
		int i=0;
		if(str.equals("A")){
			i=0;
		}else{
			i=1;
		}
		return i;
	}
	public static int three(String str){
		int i=0;
		if(str.equals("D")){
			i=1;
		}else{
			i=0;
		}
		return i;
	}
	public static int four(String str){
		int i=0;
		if(str.equals("B")){
			i=1;
		}else{
			i=0;
		}
		return i;
	}
	public static int five(String str){
		int i=0;
		if(str.equals("D")){
			i=0;
		}else{
			i=1;
		}
		return i;
	}
}
