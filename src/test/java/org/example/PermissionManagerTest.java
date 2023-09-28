package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermissionManagerTest {
    PermissionManager permissionManager= new PermissionManager();

    @Test
    void getRoleNameString() {
        PermissionLevel levelEnum = permissionManager.getRoleName();
        String stringEnum = permissionManager.getRoleNameString(levelEnum);
        assertEquals("User", stringEnum);
    }

    @Test
    void getRoleName() {
        assertEquals(PermissionLevel.USER,permissionManager.getRoleName());
    }

    @Test
    void setPermissionLevel() {
        permissionManager.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN,permissionManager.getRoleName());
    }
}