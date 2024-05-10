# JetPicker

JetPicker is a Jetpack Compose library that provides a customizable picker view component for selecting items in a list.

## Previews
Here is preview of the JetPicker component:

<img src="/previews/preview.gif" align="center"  width="24%"/>

## Installation

Add the following dependency to your project's `build.gradle` file:

```groovy
dependencies {
    implementation 'com.github.ytam:JetPicker:Tag'
}
```
Replace Tag with the latest release tag of JetPicker library from [GitHub releases.](https://github.com/ytam/JetPicker/releases)


Ensure that you have configured the JitPack repository in your settings.gradle file:


```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```


Usage
JetPickerView is the main component of the library. It provides a picker view for selecting items in a list.


```kotlin
@Composable
fun MyScreen() {
    var selectedItem by remember { mutableStateOf("") }

    val items = (1..100).toList().map { it.toString() }

    JetPickerView(
        modifier = Modifier.padding(32.dp),
        textModifier = Modifier.padding(8.dp),
        items = items,
        initialIndex = 0,
        visibleItemCount = 5,
        endText = "Age",
        onValueChange = { selectedItem = it }
    )

    Text(text = "Selected item: $selectedItem")
}
```

Parameters
 + `modifier`: Modifier for the parent layout.
 + `textStyleModifier`: Modifier for styling the text within the picker view.
 + `listItems`: List of items to be displayed in the picker.
 + `initialIndex`: Index of the item to be initially selected.
 + `visibleItemCount`: Number of visible items in the picker view.
 + `textStyle`: TextStyle for the text within the picker view.
 + `dividerColor`: Color of the divider between items.
 + `endText`: Text to be displayed at the end of the picker view.
 + `onValueChange`: Callback to be invoked when an item is selected.

# License
```xml
Designed and developed by 2024 Yıldırım Tam

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
