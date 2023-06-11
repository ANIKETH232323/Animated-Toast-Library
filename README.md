# Animated-Toast-Library
This custom made library helps you to design custom Toasts easily with minimal lines of code.

## Prerequisites
>Step 1. Add the JitPack repository to your settings.gradel file
```
dependencyResolutionManagement {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  >Step 2. Add the dependency

```
dependencies {
		implementation 'com.github.ANIKETH232323:Animated-Toast-Library:Tag'

	}
  ```
  ## Use:- 

To display a Toast:-

(This is the syntax)
``````         

AnimeToasty.makeToast(context,"msg",animation,background,duration).show();
````````

### Example :- 

```
AnimeToasty.makeToast(this,"You are Right",R.raw.loadingwrong, R.drawable.shape,
                AnimeToasty.LENGTH_SHORT).show();
```
### The defult background or the defult toast outbody is Rectangular.

## Screenshots:-
<img src ="https://github.com/ANIKETH232323/Animated-Toast-Library/assets/102458123/8bf7a27c-c7f4-4632-9167-f548547144ab" width ="400" >

### You have to create your own custom Toast message outerbody shape and that shape colour as a background according to your need

## Screenshots:-
<img src ="https://github.com/ANIKETH232323/Animated-Toast-Library/assets/102458123/a29bfc78-854f-4a80-ae5b-9a988818ff28" width ="400" >

## Screenshots(Gif):-
<img src ="https://github.com/ANIKETH232323/Custom_Toast/assets/102458123/0a9bbc87-b4ff-48b7-802a-52d824eda98d" width = "400">
<br>
<img src ="https://github.com/ANIKETH232323/Custom_Toast/assets/102458123/ef77b260-4035-4d40-b1e0-e5a9ce614097" width = "400">


# Contributing:-
Any contributions  are welcomed and appreciated .



