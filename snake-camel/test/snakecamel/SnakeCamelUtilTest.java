package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelUtilTest {
	@Test
	public void 頭文字を小文字から大文字にする() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected1="";
		String actual1=sc.capitalize("");
		assertThat(actual1,is(expected1));
		
		String expected2="A";
		String actual2=sc.capitalize("a");
		assertThat(actual2,is(expected2));
		
		String expected3="Xyz";
		String actual3=sc.capitalize("xyz");
		assertThat(actual3,is(expected3));
	}
	
	@Test
	public void 頭文字を大文字から小文字にする() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected1="";
		String actual1=sc.uncapitalize("");
		assertThat(actual1,is(expected1));
		
		String expected2="a";
		String actual2=sc.uncapitalize("A");
		assertThat(actual2,is(expected2));
		
		String expected3="xyz";
		String actual3=sc.uncapitalize("Xyz");
		assertThat(actual3,is(expected3));
		
	}

	@Test
	public void スネークケースをキャメルケースにする() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected1="Abc";
		String actual1=sc.snakeToCamelcase("abc");
		assertThat(actual1,is(expected1));
		
		String expected2="AbcDef";
		String actual2=sc.snakeToCamelcase("abc_def");
		assertThat(actual2,is(expected2));
		
		String expected3="AbcDefGh";
		String actual3=sc.snakeToCamelcase("abc_def_gh");
		assertThat(actual3,is(expected3));
		
		String expected4="AbcDefGh";
		String actual4=sc.snakeToCamelcase("abc__def__gh");
		assertThat(actual4,is(expected4));
	
		String expected5="AbcDef";
		String actual5=sc.snakeToCamelcase("_abc_def__");
		assertThat(actual5,is(expected5));
	}
	
	@Test
	public void キャメルケースをスネークケースにする() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected1="abc";
		String actual1=sc.camelToSnakecase("Abc");
		assertThat(actual1,is(expected1));
		
		String expected2="abc_def";
		String actual2=sc.camelToSnakecase("AbcDef");
		assertThat(actual2,is(expected2));
		
		String expected3="abc_def_gh";
		String actual3=sc.camelToSnakecase("AbcDefGh");
		assertThat(actual3,is(expected3));
	}


}
