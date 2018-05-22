import static org.junit.Assert.*;


import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IntToEnglishTest {

	@Test
	public void 一を入力したときoneと出力される() {
IntToEng ite=new IntToEng();
		String expected= "one";
		String actual=ite.translateEng(1);
		assertThat(actual,is(expected));	
	}
	@Test
	public void 二を入力したときtwoと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "two";
				String actual=ite.translateEng(2);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 三を入力したときthreeと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "three";
				String actual=ite.translateEng(3);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 四を入力したときfourと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "four";
				String actual=ite.translateEng(4);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 五を入力したときoneと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "five";
				String actual=ite.translateEng(5);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 六を入力したときsixと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "six";
				String actual=ite.translateEng(6);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 七を入力したときoneと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "seven";
				String actual=ite.translateEng(7);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 八を入力したときeightと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "eight";
				String actual=ite.translateEng(8);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 九を入力したときnineと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "nine";
				String actual=ite.translateEng(9);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 十を入力したときeightと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "ten";
				String actual=ite.translateEng(10);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 十一を入力したときelevenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "eleven";
				String actual=ite.translateEng(11);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 十二を入力したときtwelveと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twelve";
				String actual=ite.translateEng(12);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 十三を入力したときthirteenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirteen";
				String actual=ite.translateEng(13);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 十四を入力したときeightと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "fourteen";
				String actual=ite.translateEng(14);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 十五を入力したときfifteenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "fifteen";
				String actual=ite.translateEng(15);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 十六を入力したときsixteenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "sixteen";
				String actual=ite.translateEng(16);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 十七を入力したときseventeenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "seventeen";
				String actual=ite.translateEng(17);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 十八を入力したときeighteenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "eighteen";
				String actual=ite.translateEng(18);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 十九を入力したときnineteenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "nineteen";
				String actual=ite.translateEng(19);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十を入力したときtwentと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty";
				String actual=ite.translateEng(20);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十一を入力したときtwentyoneと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-one";
				String actual=ite.translateEng(21);
				assertThat(actual,is(expected));	
			}
	public void 二十二を入力したときtwentytwoと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-two";
				String actual=ite.translateEng(22);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十三を入力したときtwentythreeと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-three";
				String actual=ite.translateEng(23);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十四を入力したときtewntyfourと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-four";
				String actual=ite.translateEng(24);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十五を入力したときtwentyfiveと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-five";
				String actual=ite.translateEng(25);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十六を入力したときtwentysixと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-six";
				String actual=ite.translateEng(26);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十七を入力したときtwentysevenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-seven";
				String actual=ite.translateEng(27);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十八を入力したときtwentyeightと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-eight";
				String actual=ite.translateEng(28);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 二十九を入力したときtwentynineと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "twenty-nine";
				String actual=ite.translateEng(29);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十を入力したときthirteenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirteen";
				String actual=ite.translateEng(30);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十一を入力したときthirtyoneと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-one";
				String actual=ite.translateEng(31);
				assertThat(actual,is(expected));	
			}
	public void 三十二を入力したときthirtytwoと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-two";
				String actual=ite.translateEng(32);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十三を入力したときthitythreeと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-three";
				String actual=ite.translateEng(33);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十四を入力したときthiryfourと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-four";
				String actual=ite.translateEng(34);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十五を入力したときthirtyfiveと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-five";
				String actual=ite.translateEng(35);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十六を入力したときthirtysixと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-six";
				String actual=ite.translateEng(36);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十七を入力したときthirtysevenと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-seven";
				String actual=ite.translateEng(37);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十八を入力したときthirtyeightと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-eight";
				String actual=ite.translateEng(38);
				assertThat(actual,is(expected));	
			}
	
	@Test
	public void 三十九を入力したときthirtynineと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "thirty-nine";
				String actual=ite.translateEng(39);
				assertThat(actual,is(expected));	
			}
	public void 四十を入力したときfourtyと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "fourty";
				String actual=ite.translateEng(40);
				assertThat(actual,is(expected));	
			}
}
