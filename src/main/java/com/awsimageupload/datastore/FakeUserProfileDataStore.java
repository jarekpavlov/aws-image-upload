package com.awsimageupload.datastore;

import com.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("6bb89648-dcff-46f6-b753-a77a9f3a3ae4"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("3e49d4f8-d95f-491f-8500-9cff319f76a0"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
