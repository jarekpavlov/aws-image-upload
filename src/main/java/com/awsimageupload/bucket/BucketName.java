package com.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("spr-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
