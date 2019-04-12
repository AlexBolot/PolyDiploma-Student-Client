#!/bin/bash

# the image will be removed when stopped
docker run --rm -it -v `pwd`:/host team-e/polydiploma-client-alum

# ^C to stop
