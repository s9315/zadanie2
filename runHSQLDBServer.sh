#!/bin/bash

java -cp /opt/devel/db/hsqldb-2.2.9/hsqldb/lib/hsqldb.jar org.hsqldb.server.Server --database.0 mem:mydb --dbname.0 workdb

