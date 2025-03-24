package L24_03_2025.permission;

import java.util.EnumMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        EnumMap<Role, Integer> roleIntegerEnumMap = new EnumMap<>(Role.class);
        roleIntegerEnumMap.put(Role.USER, 10);
        roleIntegerEnumMap.put(Role.GUEST, 30);
        roleIntegerEnumMap.put(Role.ADMIN, 3);

        System.out.println(("Количество пользователей по ролям"));
        for(Map.Entry<Role, Integer> roleIntegerEntry:roleIntegerEnumMap.entrySet()){
            System.out.println(roleIntegerEntry.getKey() + ":" + roleIntegerEntry.getValue());
        }
        Role user = Role.USER;
        for (Permission permission : user.getPermissions()) {
            System.out.println(permission + ":" + permission.getDescription());
        }
        System.out.println(user.hasPermission(Permission.DELETE));

        for (Role value : Role.values()) {
            System.out.println(value.name());
        }
        int ordinal = user.ordinal();
        System.out.println(ordinal);
    }
}
