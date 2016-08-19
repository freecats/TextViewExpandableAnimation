# TextViewExpandableAnimation#
Expandable TextView With Smooth Transition Animation

## Preview ##
![preview](https://github.com/freecats/TextViewExpandableAnimation/blob/master/preview.gif)
## How to get it work？ ##
* Clone or download my project 

* Copy TextViewExpandableAnimation.java and some resource files such as attrs.xml into your own project

* in xml layout file

```java
<com.freecats.demo.view.TextViewExpandableAnimation xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/tv_expand"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:tvea_expandBitmap="@drawable/icon_green_arrow_down"
        app:tvea_expandLines="3"
        app:tvea_shrinkBitmap="@drawable/icon_green_arrow_up"
        app:tvea_textContentColor="@color/color_gray_light_content_text"
        app:tvea_textContentSize="@dimen/sp_txt_size_content"
        app:tvea_textExpand="@string/expand"
        app:tvea_textShrink="@string/shrink"
        app:tvea_textStateColor="@color/colorPrimary" />
```
   in java
```java
     TextViewExpandableAnimation tvExpand = (TextViewExpandableAnimation) findViewById(R.id.tv_expand);
     tvExpand.setText(text);
```
All Done!

<br>Attributes Support as below

| Attrs         |
| ------------- |
| tvea_expandLines      | 
| tvea_expandBitmap      | 
| tvea_shrinkBitmap      | 
| tvea_textContentColor |
| tvea_textContentSize | 
| tvea_textExpand |
| tvea_textShrink | 
| tvea_textStateColor |

