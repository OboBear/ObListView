LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := hello-jni
LOCAL_SRC_FILES := \
	/Users/apple/Desktop/Workspace/android/demos/ndktest/hello-jni1/app/src/main/jni/Android.mk \
	/Users/apple/Desktop/Workspace/android/demos/ndktest/hello-jni1/app/src/main/jni/Application.mk \
	/Users/apple/Desktop/Workspace/android/demos/ndktest/hello-jni1/app/src/main/jni/hello-jni.c \

LOCAL_C_INCLUDES += /Users/apple/Desktop/Workspace/android/demos/ndktest/hello-jni1/app/src/main/jni
LOCAL_C_INCLUDES += /Users/apple/Desktop/Workspace/android/demos/ndktest/hello-jni1/app/src/debug/jni

include $(BUILD_SHARED_LIBRARY)
