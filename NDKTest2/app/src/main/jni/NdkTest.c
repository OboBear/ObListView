#include"com_example_apple_ndktest_MainActivity.h"


jint getJint()
{
  return  11;
}

JNIEXPORT jstring JNICALL Java_com_example_apple_ndktest_MainActivity_getJniString
  (JNIEnv *env, jobject obj)
  {
    return (*env)->NewStringUTF(env,"I'm Obo,I'm from C file");
  }


JNIEXPORT jint JNICALL Java_com_example_apple_ndktest_MainActivity_getJniInt
        (JNIEnv *env, jobject obj)
{
  jint i = 32;
  return getJint();
}