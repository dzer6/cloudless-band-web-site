(defproject cloudless-band-web-site "1.0.0"
  :description "cloudless.band official web site"
  :url "https://cloudless.band"

  :dependencies []

  :target-path "target/%s"

  :resources-path "resources"

  :plugins [[lein-resource "15.10.2"]
            [lein-essthree "0.2.1"]
            [lein-shell "0.5.0"]
            [lein-bower "0.5.2"]]

  :bower-dependencies [[bootstrap-social "5.1.1"]
                       [jquery "2.2.1"]
                       [bootstrap "3.3.7"]]

  :bower {:directory "resources/public/lib"}

  :profiles {:prod {:resource  {:resource-paths ["resources/public"]
                                :target-path    "target/prod-app"
                                :skip-stencil   [#".*"]
                                :excludes       [#".*\.DS_Store"
                                                 #"resources/public/lib/.*"]}

                    :essthree  {:deploy {:type              :directory
                                         :bucket            "cloudless-band-prod"
                                         :local-root        "target/prod-app"
                                         :auto-content-type true}}}}

  :aliases {"build-prod-env" ["do"
                              "clean"
                              ["with-profile" "prod" "resource"]
                              ["with-profile" "prod" "essthree"]
                              ["shell" "./fix-content-types-prod-env.sh"]]})
