package com.bytehack.cryptotrack;



public class Data {
    /**
     * JSON scheme for portfolio data
     * [
     *   {
     *     "name": "DogeCoin",
     *     "id": "dgcoin1",
     *     "quantity": 10.00000
     *   },
     *   {
     *     "name": "Bitcoin",
     *     "id": "btc1",
     *     "quantity": 0.0000001
     *   },
     *   {
     *     "name": "Ethereum",
     *     "id": "ethereun1",
     *     "quantity": 10.00000
     *   },
     *   {
     *     "name": "Ripple",
     *     "id": "riplecoin1",
     *     "quantity": 9.999999
     *   },
     *   {
     *     "name": "Litecoin",
     *     "id": "litecoint1",
     *     "quantity": 5.555555
     *   }
     * ]
     */
    // Dummy data of the trader
    public static final String PORTFOLIO_DATA = "[\n  {\n    \"name\": \"DogeCoin\",\n    \"id\": \"dgcoin1\",\n    \"quantity\": 10.00000\n  },\n  {\n    \"name\": \"Bitcoin\",\n    \"id\": \"btc1\",\n    \"quantity\": 0.0000001\n  },\n  {\n    \"name\": \"Ethereum\",\n    \"id\": \"ethereun1\",\n    \"quantity\": 10.00000\n  },\n  {\n    \"name\": \"Ripple\",\n    \"id\": \"riplecoin1\",\n    \"quantity\": 9.999999\n  },\n  {\n    \"name\": \"Litecoin\",\n    \"id\": \"litecoint1\",\n    \"quantity\": 5.555555\n  }\n]";




    /*
    * [
  {
    "id": "litecoint1",
    "name": "Litecoin",
    "currencyCode": "LTC",
    "exchangeRate": 63405.3,
    "variation": 5.06
  },
  {
    "id": "bytecoin1",
    "name": "BytecoIN",
    "currencyCode": "BTC",
    "exchangeRate": 2345.3,
    "variation": 6.3
  },
  {
    "id": "alidollar1",
    "name": "AliDollar",
    "currencyCode": "ADD",
    "exchangeRate": 5605.3,
    "variation": -6.1
  },
  {
    "id": "dodgeCoin1",
    "name": "DodgeCoin",
    "currencyCode": "DDC",
    "exchangeRate": 60605.3,
    "variation": -2.36
  },
  {
    "id": "monkeymoney",
    "name": "MonkeyMoney",
    "currencyCode": "MMM",
    "exchangeRate": 22605.3,
    "variation": 4.6
  },
  {
    "id": "Ripple",
    "name": "RippleCoin",
    "currencyCode": "RPC",
    "exchangeRate": 9805.3,
    "variation": 10.3
  },
  {
    "id": "decentra",
    "name": "Decentra",
    "currencyCode": "DCT",
    "exchangeRate": 705.3,
    "variation": 12.06
  },
  {
    "id": "metacrypt",
    "name": "MetaCrypt",
    "currencyCode": "MCT",
    "exchangeRate": 8605.3,
    "variation": -7.06
  }
]
    * */


    public static final String DATA = "[\n" +
            "  {\n" +
            "    \"id\": \"litecoint1\",\n" +
            "    \"name\": \"Litecoin\",\n" +
            "    \"currencyCode\": \"LTC\",\n" +
            "    \"exchangeRate\": 63405.3,\n" +
            "    \"variation\": 5.06\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"bytecoin1\",\n" +
            "    \"name\": \"BytecoIN\",\n" +
            "    \"currencyCode\": \"BTC\",\n" +
            "    \"exchangeRate\": 2345.3,\n" +
            "    \"variation\": 6.3\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"alidollar1\",\n" +
            "    \"name\": \"AliDollar\",\n" +
            "    \"currencyCode\": \"ADD\",\n" +
            "    \"exchangeRate\": 5605.3,\n" +
            "    \"variation\": -6.1\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"dodgeCoin1\",\n" +
            "    \"name\": \"DodgeCoin\",\n" +
            "    \"currencyCode\": \"DDC\",\n" +
            "    \"exchangeRate\": 60605.3,\n" +
            "    \"variation\": -2.36\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"monkeymoney\",\n" +
            "    \"name\": \"MonkeyMoney\",\n" +
            "    \"currencyCode\": \"MMM\",\n" +
            "    \"exchangeRate\": 22605.3,\n" +
            "    \"variation\": 4.6\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"Ripple\",\n" +
            "    \"name\": \"RippleCoin\",\n" +
            "    \"currencyCode\": \"RPC\",\n" +
            "    \"exchangeRate\": 9805.3,\n" +
            "    \"variation\": 10.3\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"decentra\",\n" +
            "    \"name\": \"Decentra\",\n" +
            "    \"currencyCode\": \"DCT\",\n" +
            "    \"exchangeRate\": 705.3,\n" +
            "    \"variation\": 12.06\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"metacrypt\",\n" +
            "    \"name\": \"MetaCrypt\",\n" +
            "    \"currencyCode\": \"MCT\",\n" +
            "    \"exchangeRate\": 8605.3,\n" +
            "    \"variation\": -7.06\n" +
            "  }\n" +
            "]";
}
