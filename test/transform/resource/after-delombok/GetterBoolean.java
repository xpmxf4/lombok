class Getter {
	boolean foo;
	boolean isBar;
	boolean hasBaz;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean isFoo() {
		return this.foo;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean isBar() {
		return this.isBar;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean isHasBaz() {
		return this.hasBaz;
	}
}
class MoreGetter {
	boolean foo;
	boolean hasFoo() {
		return true;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean isFoo() {
		return this.foo;
	}
}
class YetMoreGetter {
	boolean foo;
	boolean getFoo() {
		return true;
	}
}
