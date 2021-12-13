#!/bin/bash

# error handling
set -o errexit;
set -o pipefail;
set -o nounset;
set +e;
# debug commands
#set -x;

main() {
  cat /mounted-volume/my-file.txt
}

main