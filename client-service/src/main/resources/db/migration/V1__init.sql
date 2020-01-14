CREATE TABLE client (
client_id                               int NOT NULL PRIMARY KEY,
name                                    varchar(100) NOT NULL,
document                                varchar(20) NOT NULL,
active                                  int NOT NULL,
registered                              timestamp WITH TIME ZONE NOT NULL
);

CREATE TABLE system (
system_id                               int NOT NULL PRIMARY KEY,
name                                    varchar(100) NOT NULL,
active                                  int NOT NULL,
registered                              timestamp WITH TIME ZONE NOT NULL
);