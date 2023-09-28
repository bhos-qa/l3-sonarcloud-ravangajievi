package org.example;


enum PermissionLevel {
    ADMIN("Admin"),
    DEVELOPER("Developer"),
    USER("User");

    private final String name;

    PermissionLevel(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return name;
    }
}
public class PermissionManager {
    private PermissionLevel permissionLevel;

    public PermissionManager() {
        this.permissionLevel = PermissionLevel.USER;
    }

    public String getRoleNameString(PermissionLevel permissionLevel){
        return permissionLevel.getRoleName();
    }
    public PermissionLevel getRoleName() {
        return this.permissionLevel;
    }

    public void setPermissionLevel(PermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
}
