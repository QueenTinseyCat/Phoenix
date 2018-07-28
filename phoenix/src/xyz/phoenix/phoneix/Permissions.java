package xyz.phoenix.phoneix;

public enum Permissions {

    MODERATOR(new String[]{""}),
    ADMIN(new String[]{""}),
    BUILDER(new String[]{""}),
    ASSISTANT(new String[]{""}),
    OWNER(new String[]{""}),
    DEVELOPER(new String[]{""});

    private String[] permissions;

    Permissions(String[] permissions) {
        this.permissions = permissions;
    }
    public String[] getPermissions() {
        return permissions;
    }
}
