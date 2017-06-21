#!/usr/bin/env bash

s3cmd --recursive modify --acl-public --add-header='Content-Type:text/html' --exclude='' --include='.html' s3://cloudless-band-prod/
s3cmd --recursive modify --acl-public --add-header='Content-Type:text/css' --exclude='' --include='.css' s3://cloudless-band-prod/
s3cmd --recursive modify --acl-public --add-header='Content-Type:application/javascript' --exclude='' --include='.js' s3://cloudless-band-prod/
s3cmd --recursive modify --acl-public --add-header='Content-Type:application/json' --exclude='' --include='.json' s3://cloudless-band-prod/
s3cmd --recursive modify --acl-public --add-header='Content-Type:image/png' --exclude='' --include='.png' s3://cloudless-band-prod/


