# wad

## Techniques

http://en.wikipedia.org/wiki/Spaced_repetition

## Language resources

http://developer.wordnik.com/

http://www.google.com/dictionary/json?callback=dict_api.callbacks.id100&q=test&sl=en&tl=en&restrict=pr%2Cde&client=te

http://stackoverflow.com/questions/4175533/wikionary-api-meaning-of-words

https://developers.google.com/translate/v2/getting_started

http://wordnet.princeton.edu/wordnet/related-projects/#web

http://www.dictionaryapi.com/

http://www.wordreference.com/docs/api.aspx

http://stackoverflow.com/questions/6151668/alternative-to-google-translate-api

http://www.bing.com/translator

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

Sample apps:

https://github.com/abedra/shouter

export PGHOST=localhost

psql

    \connect DBNAME

    wad=# create table slides (
    wad(# slideid bigserial PRIMARY KEY,
    wad(# title text);
    NOTICE:  CREATE TABLE will create implicit sequence "slides_slideid_seq" for serial column "slides.slideid"
    NOTICE:  CREATE TABLE / PRIMARY KEY will create implicit index "slides_pkey" for table "slides"
    CREATE TABLE

    wad=# insert into slides (title) values ('first test title');



## License

Copyright © 2013 FIXME
