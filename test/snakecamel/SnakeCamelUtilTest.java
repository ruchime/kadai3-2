package snakecamel;


import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class SnakeCamelUtilTest {

	@Test
	public void 空文字から空文字1() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = " ";
		String actual = calc.capitalize(" ");
		assertThat(actual,is(expected));
	}
	@Test
	public void aからA() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "A";
		String actual = calc.capitalize("a");
		assertThat(actual,is(expected));
	}
	@Test
	public void xyzからXyz() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = calc.capitalize("xyz");
		assertThat(actual,is(expected));
	}
	public void 空文字から空文字2() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = " ";
		String actual = calc.uncapitalize(" ");
		assertThat(actual,is(expected));
	}
	@Test
	public void Aからa() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = calc.uncapitalize("Xyz");
		assertThat(actual,is(expected));
	}
	@Test
	public void Xyzからxyz() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = calc.uncapitalize("Xyz");
		assertThat(actual,is(expected));
	}
	@Test
	public void abc_defからAbcDef() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = calc.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
	}
	@Test
	public void abcからAbc() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = calc.snakeToCamelcase("abc");
		assertThat(actual,is(expected));
	}
	@Test
	public void abc_def_ghからAbcDefGh() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = calc.snakeToCamelcase("abc_def_gh");
		assertThat(actual,is(expected));
	}
	@Test
	public void abc__def___ghからAbcDefGh() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = calc.snakeToCamelcase("abc__def___gh");
		assertThat(actual,is(expected));
	}
	@Test
	public void _abc_def__からAbcDef() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = calc.snakeToCamelcase("_abc_def__");
		assertThat(actual,is(expected));
	}
	@Test
	public void AbcDefからabc_def() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = calc.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
	}
	@Test
	public void Abcからabc() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "abc";
		String actual = calc.camelToSnakecase("Abc");
		assertThat(actual,is(expected));
	}
	@Test
	public void AbcDefGhからabc_def_gh() {
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = calc.camelToSnakecase("AbcDefGh");
		assertThat(actual,is(expected));
	}
}
