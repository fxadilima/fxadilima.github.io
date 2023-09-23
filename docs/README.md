## &#128278; What is this?

Contains Indonesian translation of Jin Yong novel, Divine Eagle Shooting Heroes (She Diao Ying Xiong Zhuan, 射鵰英雄傳)

I am trying to translate this novel into Indonesian based on the English version, which actually is _fan translated_,
so in order to get the real meaning of certain Chinese terminology, you are advised to read the original novel,
which in turn was published by Hong Kong Commercial Daily from 1957, January 1 - 1959, May 19.

Because I am _not_ quite familiar with Chinese writings, then I can only translate the story from the English version.

To view the novel outside of GitHub, we may need some _simple_, and yet effective HTML and JavaScript, which is included
here. I do not use fancy codes to transform the **Markdown** text, just enough to give us convenience and nice text,
with all references videos (if any), and also some screenshots I get from dramas here and there.

- [ ] Translation has been suspended on Chapter 38.
- [X] My story is about to grow from there.

## Server

Convenient reading, we should use some HTTP server, in this repository I added a server.js that you can use with node.js or
some other platform like NW.js (previously, Node Webkit), PHP, or something else. This will enable you to do *fetch* from
the *client*, then transform the resulting text into HTML.

Please note though, this is not the best server in the world, obviously.

To use Node Webkit, you must [download an appropriate version for your OS](https://nwjs.io/downloads/), then place the entire contents of this
repository into the same folder. This approach is really, generaly, recommended. This will greatly reduce the requirement to write a *good* server,
just to enable us to access local files using something like 'fetch()'.

## Compatibility Issues

If you do not read it directly on GitHub, some formats may not be compatible (eg. _footnotes_), I'm going to fix this as soon as I can, but unfortunately
I am still busy translating, so it may not be soon enough. But if you instead read it on GitHub, then some links to the videos, which display an image, the position
of the image may not be pleasant to look at, as it uses w3.css styles _not_ available directly for GitHub viewer. Some HTML _containers_ which rely on those
styles are also not displayed correctly.

You can still use my **reader.html** here, and load the appropriate files directly. It works.

## Downloading

The entire book can be downloaded by clicking the download button, and choose to download the ZIP.
The contents are inside 'Book1' folder.

The modules and also the HTML use external Cloud 9 editor for editing, but you do not have to download anything,
because we are using the simplest way here (use it via CDN). And the viewer also use MarkedJS, which we also use
via CDN.

I hope you enjoy the story.
