create table if not exists stocklist(
    code nvarchar(10) Primary key,
    date nvarchar(8),
    name nvarchar(200),
    stockcode nvarchar(200),
    type33code nvarchar(200),
    type17code nvarchar(200),
    typescalecode nvarchar(200)
);

create table if not exists stockdata(
    code nvarchar (10),
    timestamp bigint,
    date date,
    open_price bigint,
    high_price bigint,
    low_price bigint,
    closed_price bigint,
    volume_price bigint,
    isuse bit default 1,

    primary key (code,timestamp),
    foreign key (code) references stocklist(code)
);

create table if not exists normalMoveAvg(
    code nvarchar (10),
    date date,
    MvAvg5 bigint,
    MvAvg20 bigint,
    MvAvg60 bigint,
    MvAvg120 bigint,
    MvAvg240 bigint,
    volume_price bigint,
    isuse bit default 1,

    primary key (code,date),
    foreign key (code) references stocklist(code)
);

create table if not exists fibonachiMoveAvg(
    code nvarchar (10),
    date date,
    MvAvg5 bigint,
    MvAvg8 bigint,
    MvAvg13 bigint,
    MvAvg21 bigint,
    MvAvg34 bigint,
    MvAvg55 bigint,
    MvAvg89 bigint,
    MvAvg144 bigint,
    MvAvg233 bigint,
    volume_price bigint,
    isuse bit default 1,

    primary key (code,date),
    foreign key (code) references stocklist(code)
)

create table if not exists bollingerbandMoveAvg(
    code nvarchar (10),
    date date,
    upperline bigint,
    lowerline bigint,
    MvAvg60 bigint,
    StDv bigint,
    volume_price bigint,
    isuse bit default 1,
    primary key (code,date),
    foreign key (code) references stocklist(code)
)