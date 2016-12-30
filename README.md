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

If you use it as an item in `RecyclerView`, you may have to make sure  your `RecyclerView Adapter's onBindViewHolder` looks like this to avoid `Unexpected Shrink/Expand State`.
```java
@Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, final int position) {
        //record its state
        holder.tvExpand.setOnStateChangeListener(new TextViewExpandableAnimation.OnStateChangeListener() {
            @Override
            public void onStateChange(boolean isShrink) {
                ContentModel cm = mLists.get(position);
                cm.setShrink(isShrink);
                mLists.set(position, cm);
            }
        });
        holder.tvExpand.setText(mLists.get(position).getText());
        //important! reset its state as where it left
        holder.tvExpand.resetState(mLists.get(position).isShrink());

    }

```
<br>Attributes Support as below

| Attributes            |format|
| -------------|------------- |
| tvea_expandLines      | integer | 
| tvea_expandBitmap     | reference | 
| tvea_shrinkBitmap     |reference  | 
| tvea_textContentColor | color| 
| tvea_textContentSize  |dimension  | 
| tvea_textExpand       |string | 
| tvea_textShrink       |string  | 
| tvea_textStateColor   |color | 

# License



    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
