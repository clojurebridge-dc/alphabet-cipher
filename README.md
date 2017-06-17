# alphabet-cipher

YAY! Welcome to cipher-raffle

Open this project in nightcode. And open src-->alphabet_cipher-->core.clj

Click **RUN WITH REPL** and then click **RELOAD** to load all the contents of core.clj in the repl.

Type this in REPL:
```
(decode "publickey" "yourraffletickettext")

```

Now go to terminal/command prompt and traverse to your project directory. You should be inside alphabet-cipher directory.

Type 

```
lein test
```

You may see tests are failing.

Go back to Nightcode project and open test-->alphabet_cipher-->core_test.clj

raffleanswer -- replace it with the decoded text

publickey -- key shown during slides

yourraffleticketcode -- private key, key only given to you.

```
(deftest getmecode
  (testing "Add your keys."
    (is (= "raffleanswer" (encode "publickey" "yourraffleticketcode")))))
```

Now go back to console and run lein test again.



