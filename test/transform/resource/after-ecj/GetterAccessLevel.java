class GetterAccessLevel {
  @lombok.Getter(lombok.AccessLevel.NONE) boolean isNone;
  @lombok.Getter(lombok.AccessLevel.PRIVATE) boolean isPrivate;
  @lombok.Getter(lombok.AccessLevel.PACKAGE) boolean isPackage;
  @lombok.Getter(lombok.AccessLevel.PROTECTED) boolean isProtected;
  @lombok.Getter(lombok.AccessLevel.PUBLIC) boolean isPublic;
  @lombok.Getter(lombok.AccessLevel.NONE) String noneString;
  @lombok.Getter(lombok.AccessLevel.PRIVATE) String privateString;
  @lombok.Getter(lombok.AccessLevel.PACKAGE) String packageString;
  @lombok.Getter(lombok.AccessLevel.PROTECTED) String protectedString;
  @lombok.Getter(lombok.AccessLevel.PUBLIC) String publicString;
  @lombok.Getter(value = lombok.AccessLevel.PUBLIC) String value;
  GetterAccessLevel() {
    super();
  }
  private @java.lang.SuppressWarnings("all") @lombok.Generated boolean isPrivate() {
    return this.isPrivate;
  }
  @java.lang.SuppressWarnings("all") @lombok.Generated boolean isPackage() {
    return this.isPackage;
  }
  protected @java.lang.SuppressWarnings("all") @lombok.Generated boolean isProtected() {
    return this.isProtected;
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated boolean isPublic() {
    return this.isPublic;
  }
  private @java.lang.SuppressWarnings("all") @lombok.Generated String getPrivateString() {
    return this.privateString;
  }
  @java.lang.SuppressWarnings("all") @lombok.Generated String getPackageString() {
    return this.packageString;
  }
  protected @java.lang.SuppressWarnings("all") @lombok.Generated String getProtectedString() {
    return this.protectedString;
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated String getPublicString() {
    return this.publicString;
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated String getValue() {
    return this.value;
  }
}
