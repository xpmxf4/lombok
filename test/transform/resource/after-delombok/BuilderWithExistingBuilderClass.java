class BuilderWithExistingBuilderClass<T, K extends Number> {
	public static <Z extends Number> BuilderWithExistingBuilderClass<String, Z> staticMethod(Z arg1, boolean arg2, String arg3) {
		return null;
	}
	public static class BuilderWithExistingBuilderClassBuilder<Z extends Number> {
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private boolean arg2;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private String arg3;
		private Z arg1;
		public void arg2(boolean arg) {
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		BuilderWithExistingBuilderClassBuilder() {
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithExistingBuilderClass.BuilderWithExistingBuilderClassBuilder<Z> arg1(final Z arg1) {
			this.arg1 = arg1;
			return this;
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithExistingBuilderClass.BuilderWithExistingBuilderClassBuilder<Z> arg3(final String arg3) {
			this.arg3 = arg3;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithExistingBuilderClass<String, Z> build() {
			return BuilderWithExistingBuilderClass.<Z>staticMethod(this.arg1, this.arg2, this.arg3);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public java.lang.String toString() {
			return "BuilderWithExistingBuilderClass.BuilderWithExistingBuilderClassBuilder(arg1=" + this.arg1 + ", arg2=" + this.arg2 + ", arg3=" + this.arg3 + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static <Z extends Number> BuilderWithExistingBuilderClass.BuilderWithExistingBuilderClassBuilder<Z> builder() {
		return new BuilderWithExistingBuilderClass.BuilderWithExistingBuilderClassBuilder<Z>();
	}
}
