class BuilderWithJavaBeansSpecCapitalization {
	java.util.List<String> a;
	java.util.List<String> aField;
	String bField;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	BuilderWithJavaBeansSpecCapitalization(final java.util.List<String> a, final java.util.List<String> aField, final String bField) {
		this.a = a;
		this.aField = aField;
		this.bField = bField;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static class BuilderWithJavaBeansSpecCapitalizationBuilder {
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private java.util.ArrayList<String> a;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private java.util.ArrayList<String> aField;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private String bField;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		BuilderWithJavaBeansSpecCapitalizationBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder setZ(final String z) {
			if (this.a == null) this.a = new java.util.ArrayList<String>();
			this.a.add(z);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder setA(final java.util.Collection<? extends String> a) {
			if (a == null) {
				throw new java.lang.NullPointerException("a cannot be null");
			}
			if (this.a == null) this.a = new java.util.ArrayList<String>();
			this.a.addAll(a);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder clearA() {
			if (this.a != null) this.a.clear();
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder setyField(final String yField) {
			if (this.aField == null) this.aField = new java.util.ArrayList<String>();
			this.aField.add(yField);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder setaField(final java.util.Collection<? extends String> aField) {
			if (aField == null) {
				throw new java.lang.NullPointerException("aField cannot be null");
			}
			if (this.aField == null) this.aField = new java.util.ArrayList<String>();
			this.aField.addAll(aField);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder clearaField() {
			if (this.aField != null) this.aField.clear();
			return this;
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder setbField(final String bField) {
			this.bField = bField;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithJavaBeansSpecCapitalization build() {
			java.util.List<String> a;
			switch (this.a == null ? 0 : this.a.size()) {
			case 0: 
				a = java.util.Collections.emptyList();
				break;
			case 1: 
				a = java.util.Collections.singletonList(this.a.get(0));
				break;
			default: 
				a = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.a));
			}
			java.util.List<String> aField;
			switch (this.aField == null ? 0 : this.aField.size()) {
			case 0: 
				aField = java.util.Collections.emptyList();
				break;
			case 1: 
				aField = java.util.Collections.singletonList(this.aField.get(0));
				break;
			default: 
				aField = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.aField));
			}
			return new BuilderWithJavaBeansSpecCapitalization(a, aField, this.bField);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public java.lang.String toString() {
			return "BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder(a=" + this.a + ", aField=" + this.aField + ", bField=" + this.bField + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder builder() {
		return new BuilderWithJavaBeansSpecCapitalization.BuilderWithJavaBeansSpecCapitalizationBuilder();
	}
}
