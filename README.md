# distributed-coupon-system

This is a scalable, maintainable backend service. 

It is mainly developed by SpringBoot, HBase, kafka to build a pipeline which can handle high concurrency with low latency.

## Installation

It use maven to manage dependencies.
```bash
Please use your Idea to import this project based on Maven
```
  
## upload token of pass templates

```bash
GET: 127.0.0.1:9528/upload
merchantsId - 12
PassTemplateId: e3ec06eaacb2f1dca901556991df7bb0
```

## Create User
```bash
POST: 127.0.0.1:9528/passbook/createuser
   {
       "baseInfo": {
           "name": "monpro",
           "age": 10,
           "sex": "m"
       },
       "otherInfo": {
           "phone": "1234567890",
           "address": "sydney"
       }
   }
```

## Get inventory Info
```bash
GET: 127.0.0.1:9528/passbook/inventoryinfo?userId=109452
```

## Get Pass Template with token
```bash
GET: 127.0.0.1:9528/passbook/gainpasstemplate
{
    "userId": 109452,
    "passTemplate": {
        "id": 12,
        "title": "test网优惠券-2",
        "hasToken": true
    }
}
```

## User Operation
```bash
 userpassinfo
   GET: 127.0.0.1:9528/passbook/userpassinfo?userId=109452
 userusedpassinfo
   GET: 127.0.0.1:9528/passbook/userusedpassinfo?userId=109452
 userusepass
   POST: 127.0.0.1:9528/passbook/userusepass
   {
       "userId": 109452,
       "templateId": "e3ec06eaacb2f1dca901556991df7bb0"
   }
```

## Create feedback
```bash
POST: 127.0.0.1:9528/passbook/createfeedback
   {
       "userId": 109452,
       "type": "app",
       "templateId": -1,
       "comment": ""
   }
   {
       "userId": 109452,
       "type": "pass",
       "templateId": "e3ec06eaacb2f1dca901556991df7bb0",
       "comment": ""
   }
```

## Contributing
Currently only myself

But pull requests are welcome!