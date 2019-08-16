FROM python:3.7
WORKDIR /

RUN apt-get update

RUN apt-get install -y git

ADD requirements.txt /
RUN pip install Cython
RUN pip install -r requirements.txt
