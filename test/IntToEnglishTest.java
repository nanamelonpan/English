import static org.junit.Assert.*;


import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IntToEnglishTest {

	@Test
	public void 1を入力したときoneと出力される() {
IntToEng ite=new IntToEng();
		String expected= "one";
		String actual=ite.translateEng(1);
		assertThat(actual,is(expected));
	}

}
