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
	@Test
	public void 四十を入力したときfourtyと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "fourty";
				String actual=ite.translateEng(40);
				assertThat(actual,is(expected));	
			}
	@Test
	public void 四十一を入力したときfourtyoneと出力される() {
		IntToEng ite=new IntToEng();
				String expected= "fourty-one";
				String actual=ite.translateEng(41);
				assertThat(actual,is(expected));	
			}
			@Test
			public void 四十二を入力したときfourtytwoと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fourty-two";
						String actual=ite.translateEng(42);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 四十三を入力したときfourtythreeと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fourty-three";
						String actual=ite.translateEng(43);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 四十四を入力したときfourtyfourと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fourty-four";
						String actual=ite.translateEng(44);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 四十五を入力したときfourtyfiveと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fourty-five";
						String actual=ite.translateEng(45);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 四十六を入力したときfourtysixと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fourty-six";
						String actual=ite.translateEng(46);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 四十七を入力したときfourtysevenと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fourty-seven";
						String actual=ite.translateEng(47);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 四十八を入力したときfourtyeightと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fourty-eight";
						String actual=ite.translateEng(48);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 四十九を入力したときfourtynineと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fourty-nine";
						String actual=ite.translateEng(49);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 五十を入力したときfiftyと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty";
						String actual=ite.translateEng(50);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 五十一を入力したときfiftyoneと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-one";
						String actual=ite.translateEng(51);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 五十二を入力したときfiftytwoと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-two";
						String actual=ite.translateEng(52);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 五十三を入力したときfiftythreeと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-three";
						String actual=ite.translateEng(53);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 五十四を入力したときfiftyfourと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-four";
						String actual=ite.translateEng(54);
						assertThat(actual,is(expected));	
					}
			@Test
			public void 五十五を入力したときfiftyfiveと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-five";
						String actual=ite.translateEng(55);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 五十六を入力したときfiftysixと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-six";
						String actual=ite.translateEng(56);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 五十七を入力したときfiftysevenと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-seven";
						String actual=ite.translateEng(57);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 五十八を入力したときfiftyeightと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-eight";
						String actual=ite.translateEng(58);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 五十九を入力したときfiftynineと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "fifty-nine";
						String actual=ite.translateEng(59);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十を入力したときsixtyと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty";
						String actual=ite.translateEng(60);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十一を入力したときsixtyoneと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-one";
						String actual=ite.translateEng(61);
						assertThat(actual,is(expected));	
					}
			public void 六十二を入力したときsixtytwoと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-two";
						String actual=ite.translateEng(62);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十三を入力したときsixtythreeと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-three";
						String actual=ite.translateEng(63);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十四を入力したときsixtyfourと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-four";
						String actual=ite.translateEng(64);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十五を入力したときsixtyfiveと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-five";
						String actual=ite.translateEng(65);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十六を入力したときsixtysixと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-six";
						String actual=ite.translateEng(66);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十七を入力したときsixtysevenと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-seven";
						String actual=ite.translateEng(67);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十八を入力したときsixtyeightと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-eight";
						String actual=ite.translateEng(68);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 六十九を入力したときtsixtynineと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "sixty-nine";
						String actual=ite.translateEng(69);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十を入力したときseventyと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy";
						String actual=ite.translateEng(70);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十一を入力したときseventyoneと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-one";
						String actual=ite.translateEng(71);
						assertThat(actual,is(expected));	
					}
			public void 七十二を入力したときseventytwoと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-two";
						String actual=ite.translateEng(72);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十三を入力したときseventythreeと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-three";
						String actual=ite.translateEng(73);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十四を入力したときseventyfourと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-four";
						String actual=ite.translateEng(74);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十五を入力したときseventyfiveと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-five";
						String actual=ite.translateEng(75);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十六を入力したときseventysixと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-six";
						String actual=ite.translateEng(76);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十七を入力したときseventysevenと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-seven";
						String actual=ite.translateEng(77);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十八を入力したときseventyeightと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-eight";
						String actual=ite.translateEng(78);
						assertThat(actual,is(expected));	
					}
			
			@Test
			public void 七十九を入力したときseventynineと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "seventy-nine";
						String actual=ite.translateEng(79);
						assertThat(actual,is(expected));	
					}
			public void 八十を入力したときeightyと出力される() {
				IntToEng ite=new IntToEng();
						String expected= "eighty";
						String actual=ite.translateEng(80);
						assertThat(actual,is(expected));	
					}
}
