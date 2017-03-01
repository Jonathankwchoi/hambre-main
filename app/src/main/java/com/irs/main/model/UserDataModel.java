package com.irs.main.model;

////// TODO: 3/1/17 Maybe combine with Usermodel?

/**
 * DataController for user data
 */
public class UserDataModel {

    /**
     * code called to initiate database connection, needs to be called before
     * other method calls are made
     */
    public void connect() {
        // logon here
    }

    /**
     * Add UserModel item to database
     *
     * @param user UserModel to add into the database
     */
    public void create(UserModel user) {
        // add food to database
    }

    /**
     * Read item from database
     *
     * @param id item to read
     * @return
     */
    public UserModel read(int id) {
        return new UserModel("", false, false, false, false, -1);
    }

    /**
     * Update item in the database
     *
     * @param id      id of entry to update
     * @param newData UserModel containing the desired changes
     * @return same UserModel if successful, null otherwise
     */
    public UserModel update(int id, UserModel newData) {
        return new UserModel("", false, false, false, false, -1);
    }

    /**
     * Delete item in the database
     *
     * @param id id of item to delete
     * @return UserModel representing data which was destroyed
     */
    public UserModel destroy(int id) {
        return new UserModel("", false, false, false, false, -1);
    }
}